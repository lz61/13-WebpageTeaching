var student = {
    name: "初音未来",
    scores: [1, 2, 3, 4, 5],
};
function calculateAverageScore(student) {
    var sum = 0;
    for (var i = 0; i < student.scores.length; i++) {
        sum += student.scores[i];
    }
    var averageScore = sum / student.scores.length;
    student.averageScore = averageScore;
    return student;
}
student = calculateAverageScore(student);
// 输出一个对象中的所有内容
console.log(JSON.stringify(student));
