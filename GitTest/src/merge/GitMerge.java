package merge;

import inter.GitService;

public class GitMerge implements GitService{

	@Override
	public void wirte(String contents) {
		System.out.println(contents);
		
	}

	public void read() {
		System.out.println("Å×½ºÆ® ÀÔ´Ï´Ù.");
	}
	
	public void listen() {
		System.out.println("µè±âÀÔ´Ï´Ù.");
	}

	@Override
	public int calurate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String contents() {
		System.out.println("ÄÁÅÙÃ÷ Ã¤¿ü½À´Ï´Ù.");
		return null;
	}
}
