
    export function createCard(player){
    
        const divCard = document.getElementById('container-card');
        
        var name = document.createElement('h3');
        name.textContent = player.name ;
        
        divCard.appendChild(name);
    }
