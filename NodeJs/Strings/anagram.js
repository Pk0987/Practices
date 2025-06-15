// function isAnagram(str1, str2){
//     let value1 = str1.split('').sort().join('');
//     let value2 = str2.split('').sort().join('');
//     return value1 === value2 ? 'Anagram' : 'Not a anagram';
// }   

function isAnagram(str1, str2){
    // Normalize, remove spaces, convert to lowercase
    const normalize = str => str.toLowerCase().replace(/[^a-z0-9]/g,'');

    const s1 = normalize(str1);
    const s2 = normalize(str2);

    if(s1.length !== s2.length) return false;
    
    // compare and return
    return s1.split('').sort().join('') === s2.split('').sort().join('');
}
console.log(isAnagram('listen','silent'));
