const json = '{"first":"Prateek", "last":"Sengar"}';
const name = eval('('+json+')');

console.log(name.first);
console.log(name.last);