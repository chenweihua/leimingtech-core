package com.leimingtech.core.lucene.analyzer;

import java.io.File;

import com.leimingtech.core.mmseg4j.core.Dictionary;
import com.leimingtech.core.mmseg4j.core.MaxWordSeg;
import com.leimingtech.core.mmseg4j.core.Seg;

public class MaxWordAnalyzer extends MMSegAnalyzer {
	public MaxWordAnalyzer() {
	}

	public MaxWordAnalyzer(String path) {
		super(path);
	}

	public MaxWordAnalyzer(Dictionary dic) {
		super(dic);
	}

	public MaxWordAnalyzer(File path) {
		super(path);
	}

	protected Seg newSeg() {
		return new MaxWordSeg(this.dic);
	}
}
