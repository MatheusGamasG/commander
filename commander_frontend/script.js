

const buttonElement = document.querySelector('form');

const inputElement = document.querySelector('input[type="text"]');
const inputValue = inputElement.value;

buttonElement.addEventListener('submit', event => {
  event.preventDefault();
fetch('http://localhost:8080/games', {
  method: "POST",
  headers: {
    "Content-Type": "application/json"
  },
  body: JSON.stringify({

    players: [{ 
      name: inputValue, 
      paymentMethod: 1, 
      totalAmountConsumed: "90", 
        itemsConsumed:[{
          name: "Coca-cola",
          unityValue: "5",
          quantityConsumed: 3
        }]
    }, 
           
    { 
      name: "Jane", 
      paymentMethod: 0,
      totalAmountConsumed: "70" 
    }],

    monthAssigned: 1
  })
})
  .then(function (res) {
    return res.json();
  })
  .then(function (data) {
    console.log(data);
  })
  .catch(function (error) {
    console.error(error);
  });
});
