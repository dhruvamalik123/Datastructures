package com.datastructure.important;

public class distinctprimefactors {
	public static void main(String[] args) {
//		int[] nums={2,14,19,19,5,13,18,10,15,20};
//		int count = 0;
//		int prod = 1;
////		primeFactors(nums[0]);
//		if (nums.length == 1) {
//			if (nums[0] % 2 == 0) {
//				count++;
//			}
////			System.out.println("---------------"+Math.sqrt(nums[0])+"-------");
//			int sq=(int)Math.sqrt(nums[0]);
//			for (int i = 3; i<= sq; i = i + 2) {
//				if (nums[0] % i == 0) {
//					nums[0] = nums[0] / i;
//					count++;
//				}
//			}
//			System.out.println("---------------"+(nums[0])+"-------");
//			System.out.println (count+" here done");
//			System.out.println("-------");
//
//		}
////		if (nums.length == 2) {
////			int m = lcm(nums[0], nums[1]);
////			if (m % 2 == 0) {
////				count++;
////			}
////			for (int i = 3; i * i <= m; i = i + 2) {
////				if (m % i == 0) {
////					m = m / i;
////					count++;
////				}
////			}
////			System.out.println(count);
////
////		}
//		for (int i = 0; i < nums.length - 1; i++) {
//			prod *= nums[i];
//		}
//		// int k=gcd(prod,nums[nums.length-1]);
//		int l = lcm(prod, nums[nums.length - 1]);
//		// System.out.print(l);
//		// int count=0;
//		if (l % 2 == 0) {
//			count++;
//		}
//		// while(l%2==0){
//		// // count+=1;
//		// l=l/2;
//		// }
//		for (int i = 3; i * i <= l; i = i + 2) {
//			if (l % i == 0) {
//				l = l / i;
//				count++;
//			}
//		}
//		System.out.println(count+"this works");
		int[] nums={2,14,19,19,5,13,18,10,15,20};
		long res=distinctPrimeFactor(nums);
		System.out.println(res);

	}

		public static long distinctPrimeFactor(int[] nums) {
			int count = 0;
			int prod = 1;
			int flag = 0;
			if (nums.length == 1) {
				if (nums[0] % 2 == 0) {
					while (nums[0] % 2 == 0) {
						nums[0] = nums[0] / 2;
					}
					count++;
				}
				int sq = (int) Math.sqrt(nums[0]);
				for (int i = 3; i <= sq; i = i + 2) {
					while (nums[0] % i == 0) {
						nums[0] = nums[0] / i;
						if (flag == 0) {
							count++;
						}
						flag = 1;
					}
					flag = 0;
				}
				if (nums[0] > 2) {
					count++;
				}

				return (count);
			}
			if (nums.length == 2) {
				long m = lcm(nums[0], nums[1]);
				if (m % 2 == 0) {
					while (m % 2 == 0) {
						m = m / 2;
					}
					count++;
				}
				int sq = (int) Math.sqrt(m);
				for (int i = 3; i <= sq + 2; i = i + 2) {
					while (m % i == 0) {
						m = m / i;
						if (flag == 0) {
							count++;

						}
						flag = 1;
					}
					flag = 0;
				}
				if (m > 2) {
					count++;
				}

				return (count);

			}
			for (int i = 0; i < nums.length - 1; i++) {
				prod *= nums[i];
			}
			// int k=gcd(prod,nums[nums.length-1]);
			long l = lcm(prod, nums[nums.length - 1]);
			// System.out.print(l);
			// int count=0;
			if (l % 2 == 0) {
				while (l % 2 == 0) {
					l = l / 2;
				}
				count++;
				// count++;
			}
			// while(l%2==0){
			// // count+=1;
			// l=l/2;
			// }
			int sq = (int) Math.sqrt(l);
			for (int i = 3; i <= sq + 2; i = i + 2) {
				while (l % i == 0) {
					l = l / i;
					if (flag == 0) {
						count++;
					}
					flag = 1;
				}
				flag = 0;
			}
			if(l>2){
				count++;
			}
			return (count);

		}

		private static long lcm(long a, long b) {
			long v = (a * b);
			long g = gcd(a, b);
			return v / g;

		}

		private static long gcd(long a, long b) {
			if (a == 0) {
				return b;
			}
			return gcd(b % a, a);
		}
	}
//	private static int lcm(int a, int b) {
//		int v=Math.abs(a*b);
//		int g=gcd(a,b);
//		return v/g;
//
//	}
//
//	private static int gcd(int a, int b) {
//		if(a==0){
//			return b;
//		}
//		return gcd(b%a,a);
//	}



