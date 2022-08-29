window.setInterval("AutoShow()",1000);
  n=1;
 function AutoShow()  {
 
       document.getElementById("footimg").src="../images/n"+n+".jpg";
       if(n>=4) n=1;
      else n++;
   }
   function ponitchange(para)
   {
     document.getElementById("footimg").src="../images/n"+para+".jpg"
   }