var ul = document.getElementById('list');
var select = document.getElementById("product");
var options = select.options;

export function createItem(contador){

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
    input_qtd.setAttribute('name','quantity');
  
    ul.appendChild(elemento);
    elemento.appendChild(label);
    elemento.appendChild(input);
    elemento.appendChild(label_qtd);
    elemento.appendChild(input_qtd);
  }//createItem


  export function createPlayer(){
    
  }