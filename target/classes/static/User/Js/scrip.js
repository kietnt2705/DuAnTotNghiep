const rightbtn = document.querySelector('.fa-chevron-right')
const leftbtn = document.querySelector('.fa-chevron-left')
const imgNumber = document.querySelectorAll('.slider-content-left-top img')
let index = 0
console.log(rightbtn)
rightbtn.addEventListener("click", function () {
    index = index + 1
    if (index > imgNumber.length - 1) {
        index = 0
    }
    document.querySelector(".slider-content-left-top").style.right = index * 100 + "%"
})
leftbtn.addEventListener("click", function () {
    index = index - 1
    if (index <= -1) {
        index = imgNumber.length - 1
    }
    document.querySelector(".slider-content-left-top").style.right = index * 100 + "%"
}) 
//--------------------------------------slider-product1---------------------------------------//
const rightbtnslide = document.querySelector('.fa-chevron-right-slide')
const leftbtnslide = document.querySelector('.fa-chevron-left-slide')
const imgNumberslide = document.querySelectorAll('.slider-product-one-content-items')
// console.log(rightbtnslide)
// console.log(leftbtnslide)
rightbtnslide.addEventListener("click", function () {
    index = index + 1
    if (index > imgNumberslide.length - 1) {
        index = 0
    }
    document.querySelector(".slider-product-one-content-items-content").style.right = index * 100 + "%"
})
leftbtnslide.addEventListener("click", function () {
    index = index - 1
    if (index <= -1) {
        index = imgNumberslide.length - 1
    }
    document.querySelector(".slider-product-one-content-items-content").style.right = index * 100 + "%"
}) 
//--------------------------------------slider-product2---------------------------------------//
const rightbtnslidetwo = document.querySelector('.fa-chevron-right-slide-two')
const leftbtnslidetwo = document.querySelector('.fa-chevron-left-slide-two')
const imgNumberslidetwo = document.querySelectorAll('.slider-product-two-content-items')
//  console.log(rightbtnslidetwo)
//  console.log(leftbtnslidetwo)
rightbtnslidetwo.addEventListener("click", function () {
    index = index + 1
    if (index > imgNumberslidetwo.length - 1) {
        index = 0
    }
    document.querySelector(".slider-product-two-content-items-content").style.right = index * 100 + "%"
})
leftbtnslidetwo.addEventListener("click", function () {
    index = index - 1
    if (index <= -1) {
        index = imgNumberslidetwo.length - 1
    }
    document.querySelector(".slider-product-two-content-items-content").style.right = index * 100 + "%"
}) 
const loginbtn = document.querySelector('#form-login')
const loginclose = document.querySelector('#close-login')
// console.log(loginbtn)
loginbtn.addEventListener("click",function(){
    document.querySelector('.form-login').style.display = "flex"
})
loginclose.addEventListener("click",function(){
    document.querySelector('.form-login').style.display = "none"
})

//------------------------------------------------------đăng ký---------------------------------------------------//
const loginButton = document.getElementById('form-login');
const registerButton = document.getElementById('form-register');
const formContainer = document.getElementById('form-container');
const loginForm = document.getElementById('login-form');
const registerForm = document.getElementById('register-form');
const loginLink = document.querySelector('.form-register-body-footer-btn-text a');

loginButton.addEventListener('click', function() {
  if (formContainer.style.maxHeight) {
    formContainer.style.maxHeight = null;
  } else {
    formContainer.style.maxHeight = formContainer.scrollHeight + "px";
    registerForm.style.maxHeight = 0;
  }
});

registerButton.addEventListener('click', function() {
  if (formContainer.style.maxHeight) {
    formContainer.style.maxHeight = null;
  } else {
    formContainer.style.maxHeight = formContainer.scrollHeight + "px";
    loginForm.style.maxHeight = 0;
  }
});

loginLink.addEventListener('click', function() {
  if (formContainer.style.maxHeight) {
    formContainer.style.maxHeight = null;
  } else {
    formContainer.style.maxHeight = formContainer.scrollHeight + "px";
    registerForm.style.maxHeight = 0;
  }
});



