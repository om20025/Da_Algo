// Copyright 2011 David Galles, University of San Francisco. All rights reserved.
//
// Redistribution and use in source and binary forms, with or without modification, are
// permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of
// conditions and the following disclaimer.
//
// 2. Redistributions in binary form must reproduce the above copyright notice, this list
// of conditions and the following disclaimer in the documentation and/or other materials
// provided with the distribution.
//
// THIS SOFTWARE IS PROVIDED BY <COPYRIGHT HOLDER> ``AS IS'' AND ANY EXPRESS OR IMPLIED
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
// FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> OR
// CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
// CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
// SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
// ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
// NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
// ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//
// The views and conclusions contained in the software and documentation are those of the
// authors and should not be interpreted as representing official policies, either expressed
// or implied, of the University of San Francisco


var ARRAY_START_X = 250;
var ARRAY_START_Y = 400;
var ARRAY_ELEM_WIDTH = 40;
var ARRAY_ELEM_HEIGHT = 40;

var ARRRAY_ELEMS_PER_LINE = 1;
var ARRAY_LINE_SPACING = 1;

var TOP_POS_X = 150;
var TOP_POS_Y = ARRAY_START_Y + ARRAY_ELEM_HEIGHT;
var TOP_LABEL_X = 150;
var TOP_LABEL_Y =  ARRAY_START_Y + ARRAY_ELEM_HEIGHT + 30;

var PUSH_ELEMENT_X = 25;
var PUSH_ELEMENT_Y = 80;

var SIZE = 10;

var LINK_COLOR = "#000000"

function StackArray(am, w, h)
{
	this.init(am, w, h);
	
}

StackArray.prototype = new Algorithm();
StackArray.prototype.constructor = StackArray;
StackArray.superclass = Algorithm.prototype;


StackArray.prototype.init = function(am, w, h)
{
	StackArray.superclass.init.call(this, am, w, h);
	this.addControls();
	this.nextIndex = 0;
	this.commands = [];
	this.setup();
	this.initialIndex = this.nextIndex;
}


StackArray.prototype.addControls =  function()
{
	this.controls = [];
	this.pushField = addControlToAlgorithmBar("Text", "", "pushField");
	this.pushField.onkeydown = this.returnSubmit(this.pushField,  this.pushCallback.bind(this), 6);
	this.pushButton = addControlToAlgorithmBar("Button", "Push", "pushButton");
	this.pushButton.onclick = this.pushCallback.bind(this);
	this.controls.push(this.pushField);
	this.controls.push(this.pushButton);

	this.popButton = addControlToAlgorithmBar("Button", "Pop", "popButton");
	this.popButton.onclick = this.popCallback.bind(this);
	this.controls.push(this.popButton);

	this.printButton = addControlToAlgorithmBar("Button", "Print", "printButton");
	this.printButton.onclick = this.printCallback.bind(this);
	this.controls.push(this.printButton);
	
	this.clearButton = addControlToAlgorithmBar("Button", "Clear Stack", "clearButton");
	this.clearButton.onclick = this.clearCallback.bind(this);
	this.controls.push(this.clearButton);
	
}

StackArray.prototype.enableUI = function(event)
{
	enableUI();
	for (var i = 0; i < this.controls.length; i++)
	{
		this.controls[i].disabled = false;
	}
	
	
}
StackArray.prototype.disableUI = function(event)
{
	disableUI();
	for (var i = 0; i < this.controls.length; i++)
	{
		this.controls[i].disabled = true;
	}
}


StackArray.prototype.setup = function()
{
	this.nextIndex = 0;
	
	this.arrayID = new Array(SIZE);
	this.arrayLabelID = new Array(SIZE);
	for (var i = 0; i < SIZE; i++)
	{
		
		this.arrayID[i]= this.nextIndex++;
		this.arrayLabelID[i]= this.nextIndex++;
	}
	this.topID = this.nextIndex++;
	this.topLabelID = this.nextIndex++;
	this.topLinkID = this.nextIndex++;
	this.firstRun = true;
	
	this.arrayData = new Array(SIZE);
	this.top = -1;
	this.commands = new Array();
	
	var xpos, ypos;
	for (var i = 0; i < SIZE; i++)
	{
		xpos = (i  % ARRRAY_ELEMS_PER_LINE) * ARRAY_ELEM_WIDTH + ARRAY_START_X;
		ypos = ARRAY_START_Y - Math.floor(i / ARRRAY_ELEMS_PER_LINE) * ARRAY_LINE_SPACING * ARRAY_ELEM_HEIGHT;
		this.cmd("CreateRectangle", this.arrayID[i],"", ARRAY_ELEM_WIDTH, ARRAY_ELEM_HEIGHT,xpos, ypos);
		this.cmd("CreateLabel",this.arrayLabelID[i],  i,  xpos + ARRAY_ELEM_WIDTH, ypos);
		this.cmd("SetForegroundColor", this.arrayLabelID[i], "#0000FF");
		
	}
	this.cmd("CreateLabel", this.topLabelID, "top", TOP_LABEL_X, TOP_LABEL_Y);
	this.cmd("SetForegroundColor", this.topLabelID, "#0000FF");
	this.cmd("CreateRectangle", this.topID, -1, ARRAY_ELEM_WIDTH, ARRAY_ELEM_HEIGHT, TOP_POS_X, TOP_POS_Y);
	this.cmd("CreateRectangle", this.topLinkID, "", 0, 0, TOP_POS_X + ARRAY_ELEM_WIDTH / 2, TOP_POS_Y);
	
	this.cmd("ShowMessage", "Stack is empty!");
	
	this.highlight1ID = this.nextIndex++;
	this.highlight2ID = this.nextIndex++;

	this.animationManager.StartNewAnimation(this.commands);
	this.animationManager.skipForward();
	this.animationManager.clearHistory();
	
}

		
		
StackArray.prototype.reset = function()
{
	this.top = -1;
	this.nextIndex = this.initialIndex;
	this.cmd("ShowMessage", "Stack is empty!");
}
		
		
StackArray.prototype.pushCallback = function(event)
{
	if (this.pushField.value != "")
	{
		var pushVal = this.pushField.value;
		this.pushField.value = ""
		this.implementAction(this.push.bind(this), pushVal);
	}

	this.cmd("Step");
	this.cmd("ShowMessage", "");
}
		
		
StackArray.prototype.popCallback = function(event)
{
	this.implementAction(this.pop.bind(this), "");
	this.cmd("Step");
	this.cmd("ShowMessage", "");
}

StackArray.prototype.printCallback = function(event)
{
	this.implementAction(this.print.bind(this), "");
	this.cmd("Step");
	this.cmd("ShowMessage", "");
}

StackArray.prototype.clearCallback = function(event)
{
	this.implementAction(this.clearData.bind(this), "");
}

StackArray.prototype.clearData = function(ignored)
{
	this.commands = new Array();
	this.clearAll();
	return this.commands;			
}
		

StackArray.prototype.push = function(elemToPush)
{
	this.commands = new Array();

	if (this.top >= SIZE - 1) {
		this.cmd("ShowMessage", "Stack is full!");
		this.cmd("Step");
		return this.commands;
	}
	
	var labPushValID = this.nextIndex++;

	/* HACK: Somehow the first objects created in setup() are leaving trace in older Android version.
		 Create another Rectangle on top to cover it. And recreate objects which are moving. */
	if (this.firstRun) {
		fakeID = this.nextIndex++;
		this.cmd("CreateRectangle", fakeID, "", ARRAY_ELEM_WIDTH + 10, ARRAY_ELEM_HEIGHT + 40, TOP_POS_X, TOP_POS_Y);
		this.cmd("SetBackgroundColor", fakeID, "#F0F0F0");
		this.cmd("SetForegroundColor", fakeID, "#F0F0F0");

		this.cmd("Delete", this.topLabelID);
		this.cmd("Delete", this.topID);
		this.cmd("Delete", this.topLinkID);

		this.topID = this.nextIndex++;
		this.topLabelID = this.nextIndex++;
		this.topLinkID = this.nextIndex++;
		this.cmd("CreateLabel", this.topLabelID, "top", TOP_LABEL_X, TOP_LABEL_Y);
		this.cmd("SetForegroundColor", this.topLabelID, "#0000FF");
		this.cmd("CreateRectangle", this.topID, -1, ARRAY_ELEM_WIDTH, ARRAY_ELEM_HEIGHT, TOP_POS_X, TOP_POS_Y);
		this.cmd("CreateRectangle", this.topLinkID, "", 0, 0, TOP_POS_X + ARRAY_ELEM_WIDTH / 2, TOP_POS_Y);

		this.firstRun = false;
	}

	this.top += 1;
	this.arrayData[this.top] = elemToPush;
	
	this.cmd("ShowMessage", "Pushing Value: " + elemToPush);
	this.cmd("CreateLabel", labPushValID, elemToPush, PUSH_ELEMENT_X, PUSH_ELEMENT_Y);
	this.cmd("CreateHighlightCircle", this.highlight1ID, "#0000FF",  PUSH_ELEMENT_X, PUSH_ELEMENT_Y);
	this.cmd("Step");

	var xpos = (this.top  % ARRRAY_ELEMS_PER_LINE) * ARRAY_ELEM_WIDTH + ARRAY_START_X;
	var ypos = ARRAY_START_Y - Math.floor((this.top) / ARRRAY_ELEMS_PER_LINE) * ARRAY_LINE_SPACING * ARRAY_ELEM_HEIGHT;
	
	this.cmd("ScrollTo", TOP_POS_X, ypos);
	this.cmd("SetHighlight", this.topID, 1);
	this.cmd("Disconnect", this.topLinkID, this.arrayID[this.top - 1]);
	this.cmd("Step");
	this.cmd("Move", this.topID, TOP_POS_X, ypos);
	this.cmd("Move", this.topLinkID, TOP_POS_X + ARRAY_ELEM_WIDTH / 2, ypos);
	this.cmd("Move", this.topLabelID, TOP_POS_X, ypos + 30);
	this.cmd("SetText", this.topID, this.top)
	this.cmd("Step");
	this.cmd("SetHighlight", this.topID, 0);
	this.cmd("Connect", this.topLinkID, this.arrayID[this.top], LINK_COLOR);
	this.cmd("Step");			
	
	this.cmd("Move", this.highlight1ID, xpos, ypos); 				
	this.cmd("Move", labPushValID, xpos, ypos);
	this.cmd("Step");
	
	this.cmd("Settext", this.arrayID[this.top], elemToPush);
	this.cmd("Delete", labPushValID);
	
	this.cmd("Delete", this.highlight1ID);

	this.cmd("ShowMessage", elemToPush + " is pushed to stack.");
	
	return this.commands;
}

StackArray.prototype.print = function(ignored)
{
	this.commands = new Array();

	if (this.top < 0) {
		this.cmd("ShowMessage", "Stack is empty!");
		this.cmd("Step");
		return this.commands;
	}

	message = "Stack Contents: ";
	this.cmd("ShowMessage", message);
	for(tempTop = this.top; tempTop >= 0; tempTop--) {
	
		var labPrintValID = this.nextIndex++;
	
		var xpos = (tempTop  % ARRRAY_ELEMS_PER_LINE) * ARRAY_ELEM_WIDTH + ARRAY_START_X;
		var ypos = ARRAY_START_Y - Math.floor((tempTop) / ARRRAY_ELEMS_PER_LINE) * ARRAY_LINE_SPACING * ARRAY_ELEM_HEIGHT;
		this.cmd("CreateHighlightCircle", this.highlight1ID, "#0000FF",  xpos, ypos);
		this.cmd("Step");
		this.cmd("Move", this.highlight1ID, PUSH_ELEMENT_X, PUSH_ELEMENT_Y); 				

		this.cmd("CreateLabel", labPrintValID,this.arrayData[tempTop], xpos, ypos);
		this.cmd("Move", labPrintValID,  PUSH_ELEMENT_X, PUSH_ELEMENT_Y);
		this.cmd("Step");
		this.cmd("Delete", labPrintValID)
		this.cmd("Delete", this.highlight1ID);
		if (tempTop > 0)
			message = message + this.arrayData[tempTop] + ",  ";
		else
			message = message + this.arrayData[tempTop] + "  ";
		this.cmd("ShowMessage", message);
	}
	return this.commands;
}

StackArray.prototype.pop = function(ignored)
{
	this.commands = new Array();

	if (this.top < 0) {
		this.cmd("ShowMessage", "Stack is empty!");
		this.cmd("Step");
		return this.commands;
	}
	
	var labPopValID = this.nextIndex++;
	
	var xpos = (this.top  % ARRRAY_ELEMS_PER_LINE) * ARRAY_ELEM_WIDTH + ARRAY_START_X;
	var ypos = ARRAY_START_Y - Math.floor((this.top) / ARRRAY_ELEMS_PER_LINE) * ARRAY_LINE_SPACING * ARRAY_ELEM_HEIGHT;
	this.cmd("CreateHighlightCircle", this.highlight1ID, "#0000FF",  xpos, ypos);
	this.cmd("Step");
	this.cmd("Move", this.highlight1ID, PUSH_ELEMENT_X, PUSH_ELEMENT_Y); 				
	
	this.cmd("CreateLabel", labPopValID,this.arrayData[this.top], xpos, ypos);
	this.cmd("Settext", this.arrayID[this.top], "");
	this.cmd("Move", labPopValID,  PUSH_ELEMENT_X, PUSH_ELEMENT_Y);
	this.cmd("Step");
	this.cmd("Delete", labPopValID)
	this.cmd("Delete", this.highlight1ID);
	this.cmd("ShowMessage", "Popped Value: " + this.arrayData[this.top]);

	this.cmd("SetHighlight", this.topID, 1);
	this.cmd("Disconnect", this.topLinkID, this.arrayID[this.top]);
	this.cmd("Step");
	this.top = this.top - 1;
	ypos = ARRAY_START_Y - Math.floor((this.top) / ARRRAY_ELEMS_PER_LINE) * ARRAY_LINE_SPACING * ARRAY_ELEM_HEIGHT;
	this.cmd("SetText", this.topID, this.top)
	this.cmd("Move", this.topID, TOP_POS_X, ypos);
	this.cmd("Move", this.topLinkID, TOP_POS_X + ARRAY_ELEM_WIDTH / 2, ypos);
	this.cmd("Move", this.topLabelID, TOP_POS_X, ypos+30);
	this.cmd("Step");
	this.cmd("SetHighlight", this.topID, 0);
	if (this.top >= 0)
		this.cmd("Connect", this.topLinkID, this.arrayID[this.top], LINK_COLOR);
	
	return this.commands;
}



StackArray.prototype.clearAll = function()
{
	this.commands = new Array();
	for (var i = 0; i < this.top; i++)
	{
		this.cmd("SetText", this.arrayID[i], "");
	}
	this.top = -1;
	this.cmd("SetText", this.topID, this.top);
	return this.commands;
			
}
	


var currentAlg;

function init()
{
	var animManag = initCanvas();
	currentAlg = new StackArray(animManag, canvas.width, canvas.height);
}
