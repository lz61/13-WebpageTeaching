var score = 0;
var rank = '';
score = Number(prompt("Please input your score"));
if (score >= 90) {
    rank = "A";
}
else if (score >= 80) {
    rank = 'B';
}
else if (score >= 70) {
    rank = 'C';
}
else if (score >= 60) {
    rank = 'D';
}
else {
    rank = 'E';
}
console.log("rank is", rank);
