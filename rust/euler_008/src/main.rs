use std::cmp::max;
use std::fs;
// Find the maximum product of 13 adjacent characters in given 1_000 digit number
fn main() {
    let contents = fs::read_to_string("euler_008.txt").expect("Could not read file");
    let vec = contents
        .chars() // Creates an iterator over the characters in contents
        .filter_map(|c| c.to_digit(10)) // Parses them to base 10 digits using filter map
        .collect::<Vec<u32>>(); // Collects the digits in a Vec
    let len = vec.len();
    let adj = 13; // Represents the number of adjacent characters we want
    let mut max_product = 0;
    let mut i = 0;
    while (i + adj) < len {
        let product = (i..(i + adj)).fold(1, |multiple, j| multiple * (vec[j]) as u64);
        // use to get the product from i..i+adj, then compare that to max_product
        // start at 1 since we need to find product as opposed to sum (where we'd use 0)
        // also need to cast to avoid overflow
        max_product = max(max_product, product);
        i += 1;
    }
    println!("{max_product}");
}
