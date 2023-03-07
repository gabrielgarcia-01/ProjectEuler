fn main() {
    let max_palindrome: u64 = find_largest_palindrome(1000);
    println!("{max_palindrome}");
}
fn palindrome_checker(n: u64) -> bool {
    let s: String = n.to_string();
    let mut s_reversed: String = String::new();
    for c in s.chars().rev() {
        // Reverse the String from int
        s_reversed.push(c);
    }
    s_reversed.eq(&s) // If n equals itself reversed -> palindrome
}
fn find_largest_palindrome(n: u64) -> u64 {
    let mut max_palindrome: u64 = 0;
    for i in 100..n {
        for j in 100..n {
            let product = i * j;
            if palindrome_checker(product) && product > max_palindrome {
                max_palindrome = product;
            }
        }
    }
    max_palindrome
}
