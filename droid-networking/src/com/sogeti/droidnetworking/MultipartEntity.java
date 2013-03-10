/**
 * Resources:
 * http://svn.apache.org/viewvc/httpcomponents/httpclient/trunk/httpmime/src/main/java/org/apache/http/entity/mime/
 * http://blog.rafaelsanches.com/2011/01/29/upload-using-multipart-post-using-httpclient-in-android/
 */

package com.sogeti.droidnetworking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.http.Header;
import org.apache.http.HttpEntity;

public class MultipartEntity implements HttpEntity {
	@Override
	public void consumeContent() throws IOException {
		// TODO Auto-generated method stub
	}

	@Override
	public InputStream getContent() throws IOException, IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header getContentEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getContentLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Header getContentType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isChunked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRepeatable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStreaming() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void writeTo(final OutputStream outstream) throws IOException {
		// TODO Auto-generated method stub
	}
}
