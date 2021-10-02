var porcent = document.querySelector('.porcent');
var loading = document.querySelector('.loading');
var count = 0;
var load = setInterval(animate, window.load);

function animate(){
    if (count == 100){
        loading.parentElement.removeChild(loading);
        clearInterval(load);
    }else{
        count++
        porcent.textContent = count + '%';
    }
}
