$(window).load()
{
    setInterval(change,1000)
}
var count=1
function change()
{
    $("#sum").attr("src","../images/"+count+".jpg")
    count++
    if(count>4)
    {
        count=1
    }
}
function pointchange(id)
{
    $("#sum").attr("src","../images/"+id+".jpg")
}

