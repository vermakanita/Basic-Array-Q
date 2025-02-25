//  function f1(){

//     const a=10;
//     return function f2(){
//         console.log(a);
//     }
    
//     // f2();
//  }
// let a= f1();
// a();



function f1(){

    const a=10;

     function f2(){
        
        console.log(a);
    }
    
    f2();
 }

f1();
 