function isPalindromeWithoutFunction(str){
    const cleaned = str.toLowerCase().replace(/[^a-z0-9]/g,'');
    let left = 0;
    let right = cleaned.length - 1;

    while(left < right){
        if(cleaned[left] !== cleaned[right]){
            return 'Not a palindrome';
        }
        left++;
        right--;
    }
    return 'Palindrome';


}   
function isPalindromeWithFunction(str){
    const cleaned = str.toLowerCase().replace(/[^a-z0-9]/g,'');
    return cleaned === cleaned.split('').reverse().join('') ? 'Palindrome' : 'Not a Palindrome';
}

console.log(isPalindromeWithoutFunction('A man, a plan, a canal: Panama'));
console.log(isPalindromeWithFunction('A man, a plan, a canal: Panama'));