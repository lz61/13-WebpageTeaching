function changeObject(obj) {
    obj.name = 'New Name'; // 修改对象的属性
}

let person = { name: 'Old Name' };
changeObject(person);
console.log(person.name); // 输出: New Name