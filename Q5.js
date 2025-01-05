for(let i=1;i<=5;i++){
    for(let j=1;j<=5-i;j++){
        process.stdout.write(" ");
    }
    for(let k=i;k>=1;k--){
        process.stdout.write(k.toString());
    }
    console.log();
}