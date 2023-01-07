this.useJSInterface = true;
function disableUI() {
	if (this.useJSInterface)
		JSInterface.disableUI();
}
function enableUI()
{
	if (this.useJSInterface)
		JSInterface.enableUI();
}
function showMessage(text)
{
	this.messageText = text;
	if (this.useJSInterface)
		JSInterface.showMessage(text);
}
function getPrevMessage() {
	return this.messageText;
}
function checkAndScrollTo(x, y) {
	if (this.useJSInterface && JSInterface.canScroll())
		scrollViewTo(x, y);
}
function animSkipBack()
{
	document.getElementById('skipBackBtn').click();
}
function animStepBack() 
{
	document.getElementById('stepBackBtn').click();
}
function animPause()
{
	document.getElementById('pauseBtn').click();
}
function animStepForward()
{
	document.getElementById('stepForwardBtn').click();
}
function animSkipForward()
{
	document.getElementById('skipForwardBtn').click();
}
function setAnimationSpeed(speed)
{
	animationManager.SetSpeed(speed);
}
