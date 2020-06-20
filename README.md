# MapleStory
- Use java swing to make a MapleStory
- version: jdk9.0.4 / jdk1.8.0.251

### 編譯 
```
javac -d . main.java monster.java monster2.java monster3.java monster4.java monster5.java AePlayWave.java skillMusic.java hitMusic.java
```
### 執行 
```
java src.main
```
## Usage
請切換為輸入法到只有英文
方向鍵上下左右控制方向 (上下只有爬梯子的時候)

v:跳躍
c:普通攻擊
a:召喚八岐大蛇
x:Ruin
s:天怒
z:芬里爾墜擊

在有傳點的地方案space 可以切換背景音樂

## note
喔對 記得開聲音
有放技能的音效跟怪物被打到還有死亡的音效

## Update
- 2020/06/20
	- 上傳所有code

## bug
- 2020/06/20
	- 左右走會有有latency
	- 技能天怒以及傷害字行背景閃爍(推估跟去背網站有關)