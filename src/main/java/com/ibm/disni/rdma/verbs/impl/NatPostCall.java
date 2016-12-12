package com.ibm.disni.rdma.verbs.impl;

/**
 * Common callback for NatPostSendCall and NatPostRecvCall
 */
interface NatPostCall {
	void setAddr(NatIbvSge natIbvSge, int offset);

	void setLength(NatIbvSge natIbvSge, int offset);

	void setLkey(NatIbvSge natIbvSge, int offset);
}
