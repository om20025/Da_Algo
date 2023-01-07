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
// THIS SOFTWARE IS PROVIDED BY David Galles ``AS IS'' AND ANY EXPRESS OR IMPLIED
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


// Constants.

BST.LINK_COLOR = "#000000";
BST.HIGHLIGHT_CIRCLE_COLOR = "#FF0000";
BST.FOREGROUND_COLOR = "#000000";
BST.BACKGROUND_COLOR = "#FFFFFF";
BST.PRINT_COLOR = BST.FOREGROUND_COLOR;

BST.WIDTH_DELTA  = 50;
BST.HEIGHT_DELTA = 50;
BST.STARTING_Y = 80;


BST.FIRST_PRINT_POS_X  = 50;
BST.PRINT_VERTICAL_GAP  = 20;
BST.PRINT_HORIZONTAL_GAP = 50;



function BST(am, w, h)
{
	this.init(am, w, h);
}

BST.prototype = new Algorithm();
BST.prototype.constructor = BST;
BST.superclass = Algorithm.prototype;

BST.prototype.init = function(am, w, h)
{
	var sc = BST.superclass;
	this.startingX =  w / 2;
	this.first_print_pos_y  = h - 2 * BST.PRINT_VERTICAL_GAP;
	this.print_max  = w - 10;

	var fn = sc.init;
	fn.call(this,am);
	this.addControls();
	this.nextIndex = 0;
	this.commands = [];
	this.nextIndex = 1;
	this.animationManager.StartNewAnimation(this.commands);
	this.animationManager.skipForward();
	this.animationManager.clearHistory();
	
}

BST.prototype.addControls =  function()
{
	this.insertField = addControlToAlgorithmBar("Text", "", "insertField");
	this.insertField.onkeydown = this.returnSubmit(this.insertField,  this.insertCallback.bind(this), 4);
	this.insertButton = addControlToAlgorithmBar("Button", "Insert", "insertButton");
	this.insertButton.onclick = this.insertCallback.bind(this);
	this.deleteField = addControlToAlgorithmBar("Text", "", "deleteField");
	this.deleteField.onkeydown = this.returnSubmit(this.deleteField,  this.deleteCallback.bind(this), 4);
	this.deleteButton = addControlToAlgorithmBar("Button", "Delete", "deleteButton");
	this.deleteButton.onclick = this.deleteCallback.bind(this);
	this.findField = addControlToAlgorithmBar("Text", "", "findField");
	this.findField.onkeydown = this.returnSubmit(this.findField,  this.findCallback.bind(this), 4);
	this.findButton = addControlToAlgorithmBar("Button", "Find", "findButton");
	this.findButton.onclick = this.findCallback.bind(this);
	this.printButton = addControlToAlgorithmBar("Button", "Print", "printButton");
	this.printButton.onclick = this.printCallback.bind(this);
}

BST.prototype.reset = function()
{
	this.nextIndex = 1;
	this.treeRoot = null;
}

BST.prototype.insertCallback = function(event)
{
	var insertedValue = this.insertField.value;
	// Get text value
	if (insertedValue != "")
	{
		// set text value
		this.insertField.value = "";
		this.implementAction(this.insertElement.bind(this), insertedValue);
	}
	this.cmd("Step");
	this.cmd("Step");
	this.cmd("ScrollTo", this.startingX, BST.STARTING_Y);
	this.cmd("ShowMessage", "");
}

BST.prototype.deleteCallback = function(event)
{
	var deletedValue = this.deleteField.value;
	if (deletedValue != "")
	{
		this.deleteField.value = "";
		this.implementAction(this.deleteElement.bind(this),deletedValue);		
	}
	this.cmd("Step");
	this.cmd("Step");
	this.cmd("ScrollTo", this.startingX, BST.STARTING_Y);
	this.cmd("ShowMessage", "");
}


BST.prototype.printCallback = function(event)
{
	this.implementAction(this.printTree.bind(this),"");						
	this.cmd("Step");
	this.cmd("Step");
	this.cmd("ScrollTo", this.startingX, BST.STARTING_Y);
	this.cmd("ShowMessage", "");
}

BST.prototype.printTree = function(unused)
{
	this.commands = [];
	
	if (this.treeRoot != null)
	{
		this.highlightID = this.nextIndex++;
		this.cmd("ScrollTo", this.treeRoot.x, this.treeRoot.y);
		this.cmd("Step");
		this.cmd("CreateHighlightCircle", this.highlightID, BST.HIGHLIGHT_CIRCLE_COLOR, this.treeRoot.x, this.treeRoot.y);
		this.printTreeMessage = "Tree Contents: ";
		this.printTreeRec(this.treeRoot);
		this.cmd("Delete",  this.highlightID);
		this.cmd("Step")
		this.nextIndex++;
	}
	return this.commands;
}

BST.prototype.printTreeRec = function(tree)
{
	this.cmd("Step");
	if (tree.left != null)
	{
		this.cmd("ScrollTo", tree.left.x, tree.left.y);
		this.cmd("Step");
		this.cmd("Move", this.highlightID, tree.left.x, tree.left.y);
		this.printTreeRec(tree.left);
		this.cmd("Move", this.highlightID, tree.x, tree.y);				
		this.cmd("Step");
	}
	var nextLabelID = this.nextIndex;
	this.cmd("CreateCircle", nextLabelID, tree.showData, tree.x, tree.y);
	this.cmd("SetForegroundColor", nextLabelID, BST.PRINT_COLOR);
	this.cmd("Move", nextLabelID, this.startingX, 30);
	this.cmd("Step");
	this.printTreeMessage += tree.showData + "  ";
	this.cmd("ShowMessage", this.printTreeMessage);
	this.cmd("Step");
	this.cmd("Step");
	this.cmd("Delete", nextLabelID);
	if (tree.right != null)
	{
		this.cmd("ScrollTo", tree.right.x, tree.right.y);
		this.cmd("Step");
		this.cmd("Move", this.highlightID, tree.right.x, tree.right.y);
		this.printTreeRec(tree.right);
		this.cmd("Move", this.highlightID, tree.x, tree.y);	
		this.cmd("Step");
	}
	return;
}

BST.prototype.findCallback = function(event)
{
	var findValue = this.findField.value;
	this.findField.value = "";
	this.implementAction(this.findElement.bind(this),findValue);						
	this.cmd("Step");
	this.cmd("Step");
	this.cmd("ScrollTo", this.startingX, BST.STARTING_Y);
	this.cmd("ShowMessage", "");
}

BST.prototype.findElement = function(findValue)
{
	this.commands = [];
	
	this.highlightID = this.nextIndex++;
	
	this.doFind(this.treeRoot, findValue);
	
	
	return this.commands;
}


BST.prototype.doFind = function(tree, value)
{
	this.cmd("ShowMessage", "Searching for "+value);
	normalizedValue = this.normalizeNumber(value, 4);
	if (tree != null)
	{
		this.cmd("SetHighlight", tree.graphicID, 1);
		if (tree.data == normalizedValue)
		{
			this.cmd("ShowMessage", "Searching for "+value+" : " + value + " = " + value + " (Element found!)");
			this.cmd("Step");					
			this.cmd("ShowMessage", "Found:"+value);
			this.cmd("SetHighlight", tree.graphicID, 0);
		}
		else
		{
			if (tree.data > normalizedValue)
			{
				this.cmd("ShowMessage", "Searching for "+value+" : " + value + " < " + tree.showData + " (look to left subtree)");
				this.cmd("Step");
				this.cmd("SetHighlight", tree.graphicID, 0);
				if (tree.left!= null)
				{
					this.cmd("CreateHighlightCircle", this.highlightID, BST.HIGHLIGHT_CIRCLE_COLOR, tree.x, tree.y);
					this.cmd("ScrollTo", tree.left.x, tree.left.y);
					this.cmd("Step");
					this.cmd("Move", this.highlightID, tree.left.x, tree.left.y);
					this.cmd("Step");
					this.cmd("Delete", this.highlightID);
				}
				this.doFind(tree.left, value);
			}
			else
			{
				this.cmd("ShowMessage", "Searching for "+value+" : " + value + " > " + tree.data + " (look to right subtree)");					
				this.cmd("Step");
				this.cmd("SetHighlight", tree.graphicID, 0);
				if (tree.right!= null)
				{
					this.cmd("CreateHighlightCircle", this.highlightID, BST.HIGHLIGHT_CIRCLE_COLOR, tree.x, tree.y);
					this.cmd("ScrollTo", tree.right.x, tree.right.y);
					this.cmd("Step");
					this.cmd("Move", this.highlightID, tree.right.x, tree.right.y);
					this.cmd("Step");
					this.cmd("Delete", this.highlightID);				
				}
				this.doFind(tree.right, value);						
			}
			
		}
		
	}
	else
	{
		this.cmd("ShowMessage", "Searching for "+value+" : " + "< Empty Tree > (Element not found)");				
		this.cmd("Step");					
		this.cmd("ShowMessage", "Searching for "+value+" : " + " (Element not found)");					
	}
}

BST.prototype.insertElement = function(insertedValue)
{
	this.commands = new Array();	
	this.cmd("ShowMessage", "Inserting "+insertedValue);
	this.highlightID = this.nextIndex++;
	
	var normalizedValue = this.normalizeNumber(insertedValue, 4);
	if (this.treeRoot == null)
	{
		this.cmd("ScrollTo", this.startingX, BST.STARTING_Y);
		this.cmd("Step");
		this.cmd("CreateCircle", this.nextIndex, insertedValue,  this.startingX, BST.STARTING_Y);
		this.cmd("SetForegroundColor", this.nextIndex, BST.FOREGROUND_COLOR);
		this.cmd("SetBackgroundColor", this.nextIndex, BST.BACKGROUND_COLOR);
		this.cmd("Step");				
		this.treeRoot = new BSTNode(normalizedValue, insertedValue, this.nextIndex, this.startingX, BST.STARTING_Y)
		this.nextIndex += 1;
	}
	else
	{
		var insertElem = new BSTNode(normalizedValue, insertedValue, this.nextIndex, 100, 100)
		
		this.insert(insertElem, this.treeRoot)
		this.resizeTree();				
	}
	return this.commands;
}


BST.prototype.insert = function(elem, tree)
{
	this.cmd("SetHighlight", tree.graphicID , 1);
	this.cmd("SetHighlight", elem.graphicID , 1);
	
	if (elem.data < tree.data)
	{
		this.cmd("ShowMessage", elem.showData + " < " + tree.showData + ".  Looking at left subtree");				
	}
	else
	{
		this.cmd("ShowMessage", elem.showData + " >= " + tree.showData + ".  Looking at right subtree");				
	}
	this.cmd("Step");
	this.cmd("SetHighlight", tree.graphicID, 0);
	this.cmd("SetHighlight", elem.graphicID, 0);
	
	if (elem.data < tree.data)
	{
		if (tree.left == null)
		{
			this.cmd("ShowMessage", "Found null tree, inserting element");

			elem.x = tree.x - BST.WIDTH_DELTA/2;
			elem.y = tree.y + BST.HEIGHT_DELTA
			this.cmd("ScrollTo", elem.x, elem.y);
			this.cmd("Step");
			this.cmd("CreateCircle", this.nextIndex, elem.showData, elem.x, elem.y);
			this.cmd("SetForegroundColor", this.nextIndex, BST.FOREGROUND_COLOR);
			this.cmd("SetBackgroundColor", this.nextIndex, BST.BACKGROUND_COLOR);
			this.nextIndex += 1;
			this.cmd("Step");

			this.cmd("SetHighlight", elem.graphicID, 0);
			tree.left=elem;
			elem.parent = tree;
			this.cmd("Connect", tree.graphicID, elem.graphicID, BST.LINK_COLOR);
		}
		else
		{
			this.cmd("ScrollTo", tree.left.x, tree.left.y);
			this.cmd("Step");
			this.cmd("CreateHighlightCircle", this.highlightID, BST.HIGHLIGHT_CIRCLE_COLOR, tree.x, tree.y);
			this.cmd("Move", this.highlightID, tree.left.x, tree.left.y);
			this.cmd("Step");
			this.cmd("Delete", this.highlightID);
			this.insert(elem, tree.left);
		}
	}
	else
	{
		if (tree.right == null)
		{
			this.cmd("ShowMessage", "Found null tree, inserting element");				

			elem.x = tree.x + BST.WIDTH_DELTA/2;
			elem.y = tree.y + BST.HEIGHT_DELTA
			this.cmd("ScrollTo", elem.x, elem.y);
			this.cmd("Step");
			this.cmd("CreateCircle", this.nextIndex, elem.showData, elem.x, elem.y);
			this.cmd("SetForegroundColor", this.nextIndex, BST.FOREGROUND_COLOR);
			this.cmd("SetBackgroundColor", this.nextIndex, BST.BACKGROUND_COLOR);
			this.nextIndex += 1;
			this.cmd("Step");

			this.cmd("SetHighlight", elem.graphicID, 0);
			tree.right=elem;
			elem.parent = tree;
			this.cmd("Connect", tree.graphicID, elem.graphicID, BST.LINK_COLOR);
			this.cmd("Move", elem.graphicID, elem.x, elem.y);
		}
		else
		{
			this.cmd("ScrollTo", tree.right.x, tree.right.y);
			this.cmd("Step");
			this.cmd("CreateHighlightCircle", this.highlightID, BST.HIGHLIGHT_CIRCLE_COLOR, tree.x, tree.y);
			this.cmd("Move", this.highlightID, tree.right.x, tree.right.y);
			this.cmd("Step");
			this.cmd("Delete", this.highlightID);
			this.insert(elem, tree.right);
		}
	}
	
	
}

BST.prototype.deleteElement = function(deletedValue)
{
	this.commands = [];
	this.cmd("ShowMessage", "Deleting "+deletedValue);
	this.cmd("Step");
	this.highlightID = this.nextIndex++;
	this.treeDelete(this.treeRoot, deletedValue);
	// Do delete
	return this.commands;						
}

BST.prototype.treeDelete = function(tree, valueToDelete)
{
	var leftchild = false;
	normalizedValue = this.normalizeNumber(valueToDelete, 4);
	if (tree != null)
	{
		this.cmd("ScrollTo", tree.x, tree.y);
		this.cmd("Step");
		if (tree.parent != null)
		{
			leftchild = tree.parent.left == tree;
		}
		this.cmd("SetHighlight", tree.graphicID, 1);
		if (normalizedValue < tree.data)
		{	
			this.cmd("ShowMessage", valueToDelete + " < " + tree.showData + ".  Looking at left subtree");				
		}
		else if (normalizedValue > tree.data)
		{
			this.cmd("ShowMessage", valueToDelete + " > " + tree.showData + ".  Looking at right subtree");				
		}
		else
		{
			this.cmd("ShowMessage",  0, valueToDelete + " == " + tree.showData + ".  Found node to delete");									
		}
		this.cmd("Step");
		this.cmd("SetHighlight",  tree.graphicID, 0);
		
		if (normalizedValue == tree.data)
		{
			if (tree.left == null && tree.right == null)
			{
				this.cmd("ShowMessage", "Node to delete is a leaf.  Delete it.");									
				this.cmd("Delete", tree.graphicID);
				if (leftchild && tree.parent != null)
				{
					tree.parent.left = null;
				}
				else if (tree.parent != null)
				{
					tree.parent.right = null;
				}
				else
				{
					treeRoot = null;
				}
				this.resizeTree();				
				this.cmd("Step");
				
			}
			else if (tree.left == null)
			{
				this.cmd("ShowMessage", "Node to delete has no left child. Set parent of deleted node to right child of deleted node.");									
				if (tree.parent != null)
				{
					this.cmd("Disconnect",  tree.parent.graphicID, tree.graphicID);
					this.cmd("Connect",  tree.parent.graphicID, tree.right.graphicID, BST.LINK_COLOR);
					this.cmd("Step");
					this.cmd("Delete", tree.graphicID);
					if (leftchild)
					{
						tree.parent.left = tree.right;
					}
					else
					{
						tree.parent.right = tree.right;
					}
					tree.right.parent = tree.parent;
				}
				else
				{
					this.cmd("Delete", tree.graphicID);
					this.treeRoot = tree.right;
					this.treeRoot.parent = null;
				}
				this.resizeTree();				
			}
			else if (tree.right == null)
			{
				this.cmd("ShowMessage", "Node to delete has no right child. Set parent of deleted node to left child of deleted node.");									
				if (tree.parent != null)
				{
					this.cmd("Disconnect", tree.parent.graphicID, tree.graphicID);
					this.cmd("Connect", tree.parent.graphicID, tree.left.graphicID, BST.LINK_COLOR);
					this.cmd("Step");
					this.cmd("Delete", tree.graphicID);
					if (leftchild)
					{
						tree.parent.left = tree.left;								
					}
					else
					{
						tree.parent.right = tree.left;
					}
					tree.left.parent = tree.parent;
				}
				else
				{
					this.cmd("Delete",  tree.graphicID);
					this.treeRoot = tree.left;
					this.treeRoot.parent = null;
				}
				this.resizeTree();
			}
			else // tree.left != null && tree.right != null
			{
				this.cmd("ShowMessage", "Node to delete has two childern. Find largest node in left subtree.");									
				
				this.highlightID = this.nextIndex;
				this.nextIndex += 1;
				this.cmd("CreateHighlightCircle", this.highlightID, BST.HIGHLIGHT_CIRCLE_COLOR, tree.x, tree.y);
				var tmp = tree;
				tmp = tree.left;
				this.cmd("Move", this.highlightID, tmp.x, tmp.y);
				this.cmd("Step");																									
				while (tmp.right != null)
				{
					tmp = tmp.right;
					this.cmd("Move", this.highlightID, tmp.x, tmp.y);
					this.cmd("Step");
					this.cmd("ScrollTo", tmp.x, tmp.y);
					this.cmd("Step");																					
				}
				this.cmd("SetText", tree.graphicID, " ");
				var labelID = this.nextIndex;
				this.nextIndex += 1;
				this.cmd("CreateLabel", labelID, tmp.showData, tmp.x, tmp.y);
				tree.data = tmp.data;
				tree.showData = tmp.showData;
				this.cmd("Move", labelID, tree.x, tree.y);
				this.cmd("ShowMessage", "Copy largest value of left subtree into node to delete.");
				this.cmd("ScrollTo", tree.x, tree.y);
				this.cmd("Step");
				
				this.cmd("Step");
				this.cmd("SetHighlight", tree.graphicID, 0);
				this.cmd("Delete", labelID);
				this.cmd("SetText", tree.graphicID, tree.showData);
				this.cmd("Delete", this.highlightID);							
				this.cmd("ShowMessage", "Remove node whose value we copied.");									
				
				if (tmp.left == null)
				{
					if (tmp.parent != tree)
					{
						tmp.parent.right = null;
					}
					else
					{
						tree.left = null;
					}
					this.cmd("Delete", tmp.graphicID);
					this.resizeTree();
				}
				else
				{
					this.cmd("Disconnect", tmp.parent.graphicID,  tmp.graphicID);
					this.cmd("Connect", tmp.parent.graphicID, tmp.left.graphicID, BST.LINK_COLOR);
					this.cmd("Step");
					this.cmd("Delete", tmp.graphicID);
					if (tmp.parent != tree)
					{
						tmp.parent.right = tmp.left;
						tmp.left.parent = tmp.parent;
					}
					else
					{
						tree.left = tmp.left;
						tmp.left.parent = tree;
					}
					this.resizeTree();
				}
				
			}
		}
		else if (normalizedValue < tree.data)
		{
			if (tree.left != null)
			{
				this.cmd("CreateHighlightCircle", this.highlightID, BST.HIGHLIGHT_CIRCLE_COLOR, tree.x, tree.y);
				this.cmd("Move", this.highlightID, tree.left.x, tree.left.y);
				this.cmd("Step");
				this.cmd("Delete", this.highlightID);
			}
			this.treeDelete(tree.left, valueToDelete);
		}
		else
		{
			if (tree.right != null)
			{
				this.cmd("CreateHighlightCircle", this.highlightID, BST.HIGHLIGHT_CIRCLE_COLOR, tree.x, tree.y);
				this.cmd("Move", this.highlightID, tree.right.x, tree.right.y);
				this.cmd("Step");
				this.cmd("Delete", this.highlightID);
			}
			this.treeDelete(tree.right, valueToDelete);
		}
	}
	else
	{
		this.cmd("ShowMessage", "Elemet "+valueToDelete+" not found, could not delete");
	}
	
}

BST.prototype.resizeTree = function()
{
	var startingPoint  = this.startingX;
	this.resizeWidths(this.treeRoot);
	if (this.treeRoot != null)
	{
		if (this.treeRoot.leftWidth > startingPoint)
		{
			startingPoint = this.treeRoot.leftWidth;
		}
		else if (this.treeRoot.rightWidth > startingPoint)
		{
			startingPoint = Math.max(this.treeRoot.leftWidth, 2 * startingPoint - this.treeRoot.rightWidth);
		}
		this.setNewPositions(this.treeRoot, startingPoint, BST.STARTING_Y, 0);
		this.animateNewPositions(this.treeRoot);
		this.cmd("Step");
	}
	
}

BST.prototype.setNewPositions = function(tree, xPosition, yPosition, side)
{
	if (tree != null)
	{
		tree.y = yPosition;
		if (side == -1)
		{
			xPosition = xPosition - tree.rightWidth;
		}
		else if (side == 1)
		{
			xPosition = xPosition + tree.leftWidth;
		}
		tree.x = xPosition;
		this.setNewPositions(tree.left, xPosition, yPosition + BST.HEIGHT_DELTA, -1)
		this.setNewPositions(tree.right, xPosition, yPosition + BST.HEIGHT_DELTA, 1)
	}
	
}
BST.prototype.animateNewPositions = function(tree)
{
	if (tree != null)
	{
		this.cmd("Move", tree.graphicID, tree.x, tree.y);
		this.animateNewPositions(tree.left);
		this.animateNewPositions(tree.right);
	}
}

BST.prototype.resizeWidths = function(tree) 
{
	if (tree == null)
	{
		return 0;
	}
	tree.leftWidth = Math.max(this.resizeWidths(tree.left), BST.WIDTH_DELTA / 2);
	tree.rightWidth = Math.max(this.resizeWidths(tree.right), BST.WIDTH_DELTA / 2);
	return tree.leftWidth + tree.rightWidth;
}




function BSTNode(val, showVal, id, initialX, initialY)
{
	this.data = val;
	this.showData = showVal;
	this.x = initialX;
	this.y = initialY;
	this.graphicID = id;
	this.left = null;
	this.right = null;
	this.parent = null;
}

BST.prototype.disableUI = function(event)
{
	disableUI();
	this.insertField.disabled = true;
	this.insertButton.disabled = true;
	this.deleteField.disabled = true;
	this.deleteButton.disabled = true;
	this.findField.disabled = true;
	this.findButton.disabled = true;
	this.printButton.disabled = true;
}

BST.prototype.enableUI = function(event)
{
	enableUI();
	this.insertField.disabled = false;
	this.insertButton.disabled = false;
	this.deleteField.disabled = false;
	this.deleteButton.disabled = false;
	this.findField.disabled = false;
	this.findButton.disabled = false;
	this.printButton.disabled = false;
}


var currentAlg;

function init()
{
	var animManag = initCanvas();
	currentAlg = new BST(animManag, canvas.width, canvas.height);
	window.scrollTo((document.width / 2) - (window.innerWidth / 2), 0);
}
