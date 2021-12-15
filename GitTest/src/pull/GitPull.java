package pull;

import inter.GitService;

public class GitPull implements GitService{

	@Override
	public void wirte(String contents) {
		System.out.println(contents);
	}

}
