function foundKMP(text, pattern){
    let ans = [];
    let pos =0;
        while(pos <= text.length - pattern.length){
            let foundAt = text.indexOf(pattern,pos);
            if(foundAt != -1){
                ans.push(foundAt);
                pos = foundAt + 1;
            }
            else{
                break;
            }
        }
        return ans.length > 0 ? ans : false;
}
console.log(foundKMP('abxabcabcaby','abcaby')); // found at 6th index 
console.log(foundKMP('aaaaa','aaa')); // found at 6th index 
