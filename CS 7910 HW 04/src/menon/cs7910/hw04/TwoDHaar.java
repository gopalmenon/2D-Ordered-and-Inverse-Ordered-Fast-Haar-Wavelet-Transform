package menon.cs7910.hw04;

import java.util.Arrays;

public class TwoDHaar {
	
	private static double[][] ordered2DFastHaarWaveletTransform;
	private static boolean ordered2DTransformComplete;
	
	private static double[][] orderedInverse2DFastHaarWaveletTransform;
	private static boolean orderedInverse2DTransformComplete;

	/**
	 * Initialize class variables
	 */	
	static {
		ordered2DTransformComplete = false;
		orderedInverse2DTransformComplete = false;
	}
	
	/**
	 * Generate the ordered Haar wavelet transform in an array
	 * @param sample
	 */
	
	
	
	/**
	 * Generate the ordered 2D Haar wavelet transform and put it in an array
	 * @param sample
	 * @param samepleSizeExponent
	 * @param numberOfSweepsForward
	 */
	public static void orderedFastHaarWaveletTransformForNumSweeps(double[][] sample, int samepleSizeExponent, int  numberOfSweepsForward) {
		
	}
	
	
	/**
	 * @return a copy of the internal array for the inverse transform
	 * @throws Exception 
	 */
	public static double[][] getOrderedFastHaarWaveletTransform() throws Exception {

		if (!ordered2DTransformComplete) {
			throw new Exception("Ordered 2D Fast Haar Wavelet Transform has not been done yet.");
		}
		
		//Return a copy so as to protect the class variable
		return Arrays.copyOf(ordered2DFastHaarWaveletTransform, ordered2DFastHaarWaveletTransform.length);
	}
	
	/**
	 * Generate the inverse ordered 2D Haar wavelet transform and put it in an array
	 * @param sample
	 * @param samepleSizeExponent
	 * @param numberOfSweepsBack
	 */
	public static void orderedInverseFastHaarWaveletTransformForNumSweeps(double[][] sample, int samepleSizeExponent, int numberOfSweepsBack) {
		
	}
	
	/**
	 * @return a copy of the internal array for the inverse transform
	 * @throws Exception 
	 */
	public static double[][] getOrderedInverse2DFastHaarWaveletTransform() throws Exception {

		if (!orderedInverse2DTransformComplete) {
			throw new Exception("Ordered Inverse 2D Fast Haar Wavelet Transform has not been done yet.");
		}
		
		//Return a copy so as to protect the class variable
		return Arrays.copyOf(orderedInverse2DFastHaarWaveletTransform, orderedInverse2DFastHaarWaveletTransform.length);

	}
	
	/**
	 * Print the sample
	 * @param sample
	 */
	public static void displaySample(double[][] sample) {
		
		System.out.print("\nSample: ");
		for (double[] row : sample) {
			System.out.print("\n[");
			for (double sampleValue : row) {
				System.out.print(sampleValue);
				System.out.print('\t');
			}
			System.out.print("]");
		}
		
	}

}