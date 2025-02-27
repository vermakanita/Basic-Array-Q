

let n=15
// let n2=n.split("")
// console.log(n2)
let c=0;
for(let i=0;i<n;i++){
    let k=i.toString()
    // console.log(k)
    for(char of k)
        console.log(char)
    if(char=="2"){
        c++;
    }

}
console.log(c)