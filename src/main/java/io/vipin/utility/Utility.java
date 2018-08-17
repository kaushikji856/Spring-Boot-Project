/**
 * 
 */
package io.vipin.utility;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.vipin.model.College;

/**
 * @author VI852115
 *
 */
@Service
public class Utility {

	public static List<College> collegeList = Arrays.asList(new College(1, "JP college"),
			new College(2, "IEC college"), new College(4, "United college"));

}
