package com.ugos.jiprolog.extensions.io;

import java.io.OutputStream;
import java.util.Enumeration;

import com.ugos.io.PushBackInputStream;

public class OutputStreamInfo extends StreamInfo
{
    OutputStream m_stream;

    public OutputStreamInfo(String name, String handle, String mode, String eof_action)
	{
    	super(name, handle);
    	init(mode, eof_action);
	}

    public OutputStreamInfo(String name, String handle)
	{
    	super(name, handle);
    	init();
	}

    public OutputStreamInfo(String name)
	{
    	super(name);
    	init();
	}

    private void init(String mode, String eof_action)
    {
    	properties.setProperty("mode", "mode(" + mode + ")");
//    	properties.setProperty("mode", "mode(write)");
		properties.setProperty("output", "output");
		properties.setProperty("reposition", "reposition(false)");
		properties.setProperty("eof_action", "eof_action(" + eof_action + ")");
	}

    private void init()
    {
    	properties.setProperty("mode", "mode(append)");
//    	properties.setProperty("mode", "mode(write)");
		properties.setProperty("output", "output");
		properties.setProperty("reposition", "reposition(false)");
		properties.setProperty("eof_action", "eof_action(reset)");
	}
}
