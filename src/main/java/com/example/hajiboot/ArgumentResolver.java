package com.example.hajiboot;

import java.io.InputStream;

public interface ArgumentResolver {
	Argument resolve(InputStream stream);
	//
}
