var jiSum=0,ouSum=0;
for(var i=1;i<=1000;i++){
    if(i%2==0){
        ouSum+=i;
    }
    else{
        jiSum+=i;
    }
}
var result = ouSum-jiSum;
console.log("result=",result);