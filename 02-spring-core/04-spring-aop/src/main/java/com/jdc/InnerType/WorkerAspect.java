package com.jdc.InnerType;

import org.aopalliance.intercept.Joinpoint;

import com.jdc.utils.ShowLogger;

public class WorkerAspect {
	
	void beforeWork(Joinpoint jointpoint) {
		ShowLogger.showLog(jointpoint, );
	}

}
