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