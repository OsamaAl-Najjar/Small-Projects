var slideIndex = 3;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function showSlides(n) {
    var slides = document.getElementsByClassName("mySlides");
    if (n > slides.length) { slideIndex = 1 }
    if (n < 1) { slideIndex = slides.length }
    for (var i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }

    slides[slideIndex - 1].style.display = "block";


}


//w3.slideshow(".homeboxcontent", 7000);
var boxs = document.getElementsByClassName("homeboxcontent");
function box0(){
boxs[0].style.display = "block";
boxs[1].style.display = "none";
boxs[2].style.display = "none";
boxs[3].style.display = "none";
boxs[4].style.display = "none";}
function box1(){
boxs[0].style.display = "none";
boxs[1].style.display = "block";
boxs[2].style.display = "none";
boxs[3].style.display = "none";
boxs[4].style.display = "none";}
function box2(){
boxs[0].style.display = "none";
boxs[1].style.display = "none";
boxs[2].style.display = "block";
boxs[3].style.display = "none";
boxs[4].style.display = "none";}
function box3(){
boxs[0].style.display = "none";
boxs[1].style.display = "none";
boxs[2].style.display = "none";
boxs[3].style.display = "block";
boxs[4].style.display = "none";
}
function box4(){
boxs[0].style.display = "none";
boxs[1].style.display = "none";
boxs[2].style.display = "none";
boxs[3].style.display = "none";
boxs[4].style.display = "block";}
