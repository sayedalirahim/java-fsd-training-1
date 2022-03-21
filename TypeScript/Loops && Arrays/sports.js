var sportsOne = ["Golf", "cricket", "tennis", "swimming"];
// for(let i=0;i<sportsOne.length;i++) {
//     console.log(sportsOne[i]);
// }
// let's use the simplified for loop
for (var _i = 0, sportsOne_1 = sportsOne; _i < sportsOne_1.length; _i++) {
    var tempSport = sportsOne_1[_i];
    if (tempSport == 'cricket') {
        console.log(tempSport + "<<my fourite is!1");
    }
    else {
        console.log(tempSport);
    }
}
