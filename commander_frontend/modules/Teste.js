 import {Player} from './Player.js';

 export class Teste {
  
    constructor(date,namePlayer,paymentMethod,productsList){
        this.date = date;
        this.players = [new Player(namePlayer,paymentMethod,productsList)];
    }
  }