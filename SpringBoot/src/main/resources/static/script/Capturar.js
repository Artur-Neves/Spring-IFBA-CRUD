// pegar o elemento com id number
const number = document.querySelector('#number');
// faz qa requisição
async function getData(){
	// await ele espera pela requisição 
    const res = await fetch(`http://10.17.12.126/`);
    const data = await res.text();

    return data;
}
// mostra os dados da requisição
async function showData(){
    const data = await getData();
    // tira o nome do cara 
    number.innerHTML = data.split(' ')[2]+" °C";
    
}
// intervalo é tipo um delay
let interval = setInterval(showData, 100);