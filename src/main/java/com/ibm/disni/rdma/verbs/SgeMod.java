package com.ibm.disni.rdma.verbs;

/**
 * Provides access methods to modify a given scatter/gather element.
 */
public interface SgeMod {

	/**
	 * Sets the addr.
	 *
	 * @param addr the new addr
	 */
	public void setAddr(long addr);

	/**
	 * Gets the addr.
	 *
	 * @return the addr
	 */
	public long getAddr();

	/**
	 * Sets the length.
	 *
	 * @param length the new length
	 */
	public void setLength(int length);

	/**
	 * Gets the length.
	 *
	 * @return the length
	 */
	public int getLength();

	/**
	 * Sets the lkey.
	 *
	 * @param lkey the new lkey
	 */
	public void setLkey(int lkey);

	/**
	 * Gets the lkey.
	 *
	 * @return the lkey
	 */
	public int getLkey();
}
