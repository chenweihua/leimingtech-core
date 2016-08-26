package com.leimingtech.core.lucene.analyzer;

import java.io.File;

import com.leimingtech.core.mmseg4j.core.ComplexSeg;
import com.leimingtech.core.mmseg4j.core.Dictionary;
import com.leimingtech.core.mmseg4j.core.Seg;

public class ComplexAnalyzer extends MMSegAnalyzer {
	public ComplexAnalyzer() {
	}

	public ComplexAnalyzer(String path) {
		super(path);
	}

	public ComplexAnalyzer(Dictionary dic) {
		super(dic);
	}

	public ComplexAnalyzer(File path) {
		super(path);
	}

	protected Seg newSeg() {
		return new ComplexSeg(this.dic);
	}

}
