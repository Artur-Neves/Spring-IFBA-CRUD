function GerarMatricula(){
	var text = "IFBA";
	var aleatorio = Math.floor(Math.random()*1500);
    document.getElementById('matricula').value = (text+aleatorio);
}