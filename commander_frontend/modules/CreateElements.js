const ul = document.getElementById('list');
const select = document.getElementById("product");
var options = select.options;
var element = []
var nameLabel
var nameInput
var qtdLabel
var qtdInput

export function createItem(count){

    element[count-1] = document.createElement('li');
    element[count-1].setAttribute('class','item-product');
    element[count-1].setAttribute('name','product'+count);
  
    nameLabel = document.createElement('label');
    nameLabel.setAttribute('for','product'+ count);
    nameLabel.setAttribute('class','labels');
    nameLabel.textContent='Produto '+count + ':  ';
  
    nameInput = document.createElement('select');
    nameInput.setAttribute('class','name-items');
    nameInput.setAttribute('id','product'+count);
    nameInput.setAttribute('name','product');
  
    for (var i = 0; i < options.length; i++) {
      var option = document.createElement("option");
      option.value = options[i].value;
      option.text = options[i].text;
      nameInput.appendChild(option);
    }
  
    qtdLabel = document.createElement('label');
    qtdLabel.setAttribute('for','quantity');
    qtdLabel.setAttribute('class','labels');
    qtdLabel.textContent=' Quantidade: ';
  
    qtdInput = document.createElement('input');
    qtdInput.setAttribute('type','number');
    qtdInput.setAttribute('id','quantity'+count);
    qtdInput.setAttribute('class','name-items');
    qtdInput.setAttribute('name','quantity');
  
    ul.appendChild(element[count-1]);
    element[count-1].appendChild(nameLabel);
    element[count-1].appendChild(nameInput);
    element[count-1].appendChild(qtdLabel);
    element[count-1].appendChild(qtdInput);
  }

  export function removeElements(count){

    for(var i=count-1;i!=0;i--){
      ul.removeChild(element[i]);
    }
  }