

let sportsOne:  string[] = ["Golf", "cricket","tennis","swimming"];

// for(let i=0;i<sportsOne.length;i++) {
//     console.log(sportsOne[i]);
// }



// let's use the simplified for loop

for(let tempSport of sportsOne) {
    
    if(tempSport == 'cricket') {
        console.log(tempSport + "<<my fourite is!1");

    }
    else {
        console.log(tempSport);
    }


 
}


