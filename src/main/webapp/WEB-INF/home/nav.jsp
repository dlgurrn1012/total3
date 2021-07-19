<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<nav>
        <div class="navbar_log" style="align-items:center;">
            <i class="fab fa-accusoft"></i>
            <a href="/home">홈페이지 제작사이트</a>   
        </div>
        <ul>
            <a href="/회사소개"><li>회사소개</li></a>
            <a href="/포트폴리오"><li>포트폴리오</li></a>
            <a href="/제작과정"><li>제작과정</li></a>
            <a href="/견적문의"><li>견적문의</li></a>
            <a href="/고객센터"><li>고객센터</li></a>
        </ul>
        <ul class="navbar_icon">
            <a href=""><li><i class="fas fa-camera"></i></li></a>
            <a href=""><li><i class="far fa-envelope"></i></li></a>
            <a href=""><li><i class="fas fa-user"></i></li></a>
        </ul>
    </nav>
        <div class="slideshow-container">
            <div class="mySlides fade">
              <div class="numbertext">1 / 3</div>
              <img src="img.png" style="width:100%">
              <div class="text">그림1</div>
            </div>
            
            <div class="mySlides fade">
              <div class="numbertext">2 / 3</div>
              <img src="img2.png" style="width:100%">
              <div class="text">그림2</div>
            </div>
            
            <div class="mySlides fade">
              <div class="numbertext">3 / 3</div>
              <img src="img3.png" style="width:100%">
              <div class="text">그림3</div>
            </div>
            
            <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
            <a class="next" onclick="plusSlides(1)">&#10095;</a>
            
            </div>
            
            <div id="a" style="text-align:center">
              <span class="dot" onclick="currentSlide(1)"></span> 
              <span class="dot" onclick="currentSlide(2)"></span> 
              <span class="dot" onclick="currentSlide(3)"></span> 
            </div>
            
            <script>
            var slideIndex = 1;
            showSlides(slideIndex);
            
            function plusSlides(n) {
              showSlides(slideIndex += n);
            }
            
            function currentSlide(n) {
              showSlides(slideIndex = n);
            }
            
            function showSlides(n) {
              var i;
              var slides = document.getElementsByClassName("mySlides");
              var dots = document.getElementsByClassName("dot");
              if (n > slides.length) {slideIndex = 1}    
              if (n < 1) {slideIndex = slides.length}
              for (i = 0; i < slides.length; i++) {
                  slides[i].style.display = "none";  
              }
              for (i = 0; i < dots.length; i++) {
                  dots[i].className = dots[i].className.replace(" active", "");
              }
              slides[slideIndex-1].style.display = "block";  
              dots[slideIndex-1].className += " active";
            }
            </script>     