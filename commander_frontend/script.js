//Imports
import { Teste } from "./modules/Teste.js";
import { Item } from "./modules/Item.js";
import { createItem } from "./modules/CreateElements.js";

//Send Button
var btn_send = document.getElementById('send')

//Object Infos
var namePlayer = document.getElementById('name_player');
var date = document.getElementById('date');
var payment = document.getElementsByName('pay-method');

//Products 
var btn_addItem = document.getElementById('add-item');
var nameProduct = document.getElementsByName('product');
var qtdProduct = document.getElementsByName('quantity');
var contador = 1;
var maxProducts = 5;

//Add Product
btn_addItem.addEventListener('click', event =>{
  contador++;
  event.preventDefault();

  if(contador < maxProducts){
      createItem(contador);
  }else{
    alert('Número máximo de produtos adicionados.');
    contador--;
  }
});

function paymentMethod(){
  if(payment[0].checked){
    return payment[0].value;
  }else{
    return payment[1].value;
  }
}//paymentMethod

//Submit Form
btn_send.addEventListener("click", event => {
event.preventDefault();

//Make Products List
var productsList = [{}];
for(var i = 0; i<contador;i++){
  productsList[i] = new Item(nameProduct[i].value,4,qtdProduct[i].value);
}

//Make Object
var object = new Teste(date.value,namePlayer.value,paymentMethod(),productsList);

fetch('http://localhost:8080/games', {
  method: "POST",
  headers: {
    "Content-Type": "application/json"
  },
  body: JSON.stringify(object)
})
.then(response => response.json())
.then(data => console.log(data))
.catch(error => console.error(error));
});
