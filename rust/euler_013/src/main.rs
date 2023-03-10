use num_bigint::BigUint;
use num_traits::Zero;
use std::fs::File;
use std::io::{BufRead, BufReader};

fn main() {
    let file = File::open("euler_013.txt").unwrap();
    let reader = BufReader::new(file);
    let mut nums: Vec<BigUint> = Vec::new();

    for line in reader.lines() {
        let line = line.unwrap();
        nums.push(line.parse::<BigUint>().unwrap());
    }
    let mut total: BigUint = Zero::zero();
    for num in &nums {
        total += num;
    }
    println!("Total: {total}");
}
