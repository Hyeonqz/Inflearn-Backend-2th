package com.readable.code.studycafe.tobe.model;

import java.util.*;

public class StudyCafePasses {
	private final List<StudyCafePass> passes;

	public StudyCafePasses (List<StudyCafePass> passes) {
		this.passes = passes;
	}

	public static StudyCafePasses of (List<StudyCafePass> passes) {
		return new StudyCafePasses(passes);
	}

	public List<StudyCafePass> findPassBy (StudyCafePassType studyCafePassType) {
		return passes.stream()
			.filter(studyCafePass -> studyCafePass.isSamePassType(studyCafePassType))
			.toList();
	}

}
