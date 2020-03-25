package com.sxt.service;

public interface TestInterface {
	void m();
	void m2();
	void m3();
	/**
	 * 提交内容：
	 * commit and push提交到本地仓库和远程仓库，commit只是提交到本地仓库
	 * 更新内容：
	 * pull和fetch的区别：
	 * 可以把pull看成fetch+pull,fetch拉取远程库的Head头信息（就是项目名旁边显示有没变更的数字）
	 * ，pull是把code变更的都拉取下来。
	 * 相当于pull做了两步的工作，先用fetch的话还要pull才能变更代码
	 * fetch抓取远程的head信息，从远程仓库中下载head头信息的变更状态，没有下载真实的代码变化
	 * pull拉取，相当于先fetch head在pull code先下载head的变更，再根据头信息的变更下载真实的代码
	 * 通常直接pull
	 * 
	 * 
	 * 分支管理：
	 * 	是git开发中的一个非常有效的团队开发策略，多个程序员并行开发，每个程序员可以定义各自的分支；
	 * 在自己的分支上开发工程，在开发结束测试完毕后，再合并到主干工程中，一次性提交到远程，由其他
	 * 程序员使用。
	 * 新建分支或切换分支：
	 * 右键项目-team-switch to->New Branch或者切换到其他分支
	 * 合并分支：merge
	 * 删除分支：先删除本地分支：advanced ->delete branch
	 * 再删除远程分支：要从Remote->push...里面添加删除的选项才可以
	 * 
	 * 冲突解决：synchronsize workspace
	 * 拉取内容：拉取远程工程 右键远程工程import project
	 * 删除代码：在本地删除代码，然后提交到远程同步
	 * 忽略文件：如果本地有若干文件或目录不想提交到远程，可以使用忽略的方式实现
	 * .gitignore文件中定义的内容，都是忽略的内容，不上传到远程仓库的内容
	 * 目录-/目录名称/
	 * 文件-/文件名称...，/目录名称/文件名称
	 * /代表工程的根目录
	 * 修改.gitignore文件后，要将修改后的文件添加到索引：team->add to index
	 * 先添加了再提交commit配置保证忽略信息生效，然后再上传的时候才会生效
	 */
}
