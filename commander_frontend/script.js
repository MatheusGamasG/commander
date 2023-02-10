import { GamePackage } from "./modules/GamePackage.js";
import { Item } from "./modules/Item.js";
import { Player } from "./modules/Player.js";
import { createItem, removeElements } from "./modules/CreateElements.js";
import { createCard } from "./modules/CreateCardPlayer.js";

const btnSend = document.getElementById('btn-send');

const namePlayer = document.getElementById('name-player');
const date = document.getElementById('date');
const payment = document.getElementsByName('pay-method');

const btnAddItem = document.getElementById('add-item');
const nameProduct = document.getElementsByName('product');
const qtdProduct = document.getElementsByName('quantity');
var countProducts = 1;
var maxProducts = 5;
var productsList = [{}];

const btnAddPlayers = document.getElementById('btn-add-player');
var playersList = [{}];
var countPlayers = 0;


btnAddPlayers.addEventListener('click', event => {
  event.preventDefault();

  for(var i = 0; i<countProducts;i++){
    productsList[i] = new Item(nameProduct[i].value,4,qtdProduct[i].value);
  }

  playersList[countPlayers] = new Player(namePlayer.value,paymentMethod(),productsList);
  createCard(playersList[countPlayers]);
  countPlayers++;
  productsList = [{}];
  removeElements(countProducts);
  countProducts = 1;
});


btnAddItem.addEventListener('click', event =>{
  countProducts++;
  event.preventDefault();

  if(countProducts < maxProducts){
      createItem(countProducts);
  }else{
    alert('Número máximo de produtos adicionados.');
    countProducts--;
  }
});

function paymentMethod(){
  if(payment[0].checked){
    return payment[0].value;
  }else{
    return payment[1].value;
  }
}


btnSend.addEventListener("click", event => {
  event.preventDefault();


  var gamePackage = new GamePackage(date.value,playersList);

  fetch('http://localhost:8080/games', {
  method: "POST",
  headers: {
    "Content-Type": "application/json"
  },
  body: JSON.stringify(gamePackage)
  })
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error(error));
});
