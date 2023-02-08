
var btn_send = document.getElementById('send')
var namePlayer = document.getElementById('name_player');
var date = document.getElementById('date');
var payment = document.getElementsByName('pay-method');
var ul = document.getElementById('list');
var btn_addItem = document.getElementById('add-item');
var itens = document.getElementsByName('product');

var select = document.getElementById("product");
var options = select.options;

var contador = 1;
var maxItens = 5;

//Add Item
btn_addItem.addEventListener('click', event =>{
  contador++;
  event.preventDefault();
  
  if(contador < maxItens){
      createItem();
  }else{
    alert('Número máximo de itens adicionados.');
  }
});

function createItem(){

  var elemento = document.createElement('li');
  elemento.setAttribute('class','list-group-item');

  var label = document.createElement('label');
  label.setAttribute('for','product'+ contador);
  label.textContent='Produto '+contador + ':  ';

  var input = document.createElement('select');
  input.setAttribute('class','name-items');
  input.setAttribute('id','product'+contador);
  input.setAttribute('name','product');

  for (var i = 0; i < options.length; i++) {
    var option = document.createElement("option");
    option.value = options[i].value;
    option.text = options[i].text;
    input.appendChild(option);
  }

  var label_qtd = document.createElement('label');
  label_qtd.setAttribute('for','quantity');
  label_qtd.textContent=' Qtd: ';

  var input_qtd = document.createElement('input');
  input_qtd.setAttribute('type','number');
  input_qtd.setAttribute('id','quantity'+contador);
  input_qtd.setAttribute('class','name-items');

  ul.appendChild(elemento);
  elemento.appendChild(label);
  elemento.appendChild(input);
  elemento.appendChild(label_qtd);
  elemento.appendChild(input_qtd);
}//createItem

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

var item = [];
for(var i = 0; i<contador;i++){
  item[i] = itens[i].value;
}

fetch('http://localhost:8080/games', {
  method: "POST",
  headers: {
    "Content-Type": "application/json"
  },
  body: JSON.stringify({
    date: date.value,
    players: [{ 
      name: namePlayer.value, 
      paymentMethod: paymentMethod(), 
      totalAmountConsumed: "90", 
        itemsConsumed:[{
          name: "Coca-cola",
          unityValue: "5",
          quantityConsumed: 3
        }]
    }],

    
  })
})
.then(response => response.json())
.then(data => console.log(data))
.catch(error => console.error(error));
});
