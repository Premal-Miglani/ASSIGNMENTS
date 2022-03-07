class Person{
    constructor(first, middle, last){
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
}

var per1 = new Person("Premal", "Naresh","Miglani");
console.log(per1.first+" "+per1.middle+" "+per1.last);

var per2 = new Person("Mihir", "Gaikwad");
per2.middle = "Jagdish";
per2.last = "Gaikwad";
console.log(per2.first+" "+per2.middle+" "+per2.last);