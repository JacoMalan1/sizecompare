/*  File Version: 3.1 06/10/2013
 * 	File Version: 3.0
 *	Copyright, Jaco Malan, David Book, buzztouch.com
 *
 *	All rights reserved.
 *
 *	Redistribution and use in source and binary forms, with or without modification, are 
 *	permitted provided that the following conditions are met:
 *
 *	Redistributions of source code must retain the above copyright notice which includes the
 *	name(s) of the copyright holders. It must also retain this list of conditions and the 
 *	following disclaimer. 
 *
 *	Redistributions in binary form must reproduce the above copyright notice, this list 
 *	of conditions and the following disclaimer in the documentation and/or other materials 
 *	provided with the distribution. 
 *
 *	Neither the name of David Book, or buzztouch.com nor the names of its contributors 
 *	may be used to endorse or promote products derived from this software without specific 
 *	prior written permission.
 *
 *	THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
 *	ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
 *	WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
 *	IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
 *	INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
 *	NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
 *	PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 *	WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 *	ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY 
 *	OF SUCH DAMAGE. 
 */
package com.sizecompare;
import org.json.JSONObject;

import android.graphics.Bitmap;


public class BT_item {
	
	//properties
	private int itemIndex;
	private String itemId;
	private String itemNickname;
	private String itemType;
	private Bitmap image;
	private String imageName;
	private String imageURL;
	private String sortName;
	private boolean isHomeScreen;
	private JSONObject jsonObject;
	
	//default constructor
	public BT_item(){
		this.itemIndex = -1;
		this.itemId = "";
		this.itemNickname = "";
		this.itemType = "";
		this.imageName = "";
		this.imageURL = "";
		this.sortName = "";
		this.image = null;
		this.isHomeScreen = false;
		this.jsonObject = null;
	}
	
	//constructor with values
	public BT_item(String itemId, String itemNickname, String itemType, String jsonVars){
		this.itemIndex = -1;
		this.itemId = itemId;
		this.itemNickname = itemNickname;
		this.itemType = itemType;
		this.imageName = "";
		this.imageURL = "";
		this.sortName = "";
		this.image = null;
		this.isHomeScreen = false;
		this.jsonObject = null;
	}

	//getters / setters
	public int getItemIndex() {
		return itemIndex;
	}

	public void setItemIndex(int itemIndex) {
		this.itemIndex = itemIndex;
	}
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemNickname() {
		return itemNickname;
	}

	public void setItemNickname(String itemNickname) {
		this.itemNickname = itemNickname;
	}
	
	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}	
	

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Bitmap getImage() {
		return image;
	}

	public void setImage(Bitmap image) {
		this.image = image;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public boolean isHomeScreen() {
		return isHomeScreen;
	}

	public void setIsHomeScreen(boolean isHomeScreen) {
		this.isHomeScreen = isHomeScreen;
	}
	
	public JSONObject getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	
	
}



























