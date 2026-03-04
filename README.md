# Deploying this static project to Vercel

This repository contains a single static HTML file `9yc.html`. The included `vercel.json` config makes Vercel serve `9yc.html` as the site root.

Two common deployment methods are described below: using the Vercel CLI (fast, from your machine) or connecting a Git repository to Vercel (recommended for continuous deploys).

1) Deploy with the Vercel CLI (quick)

 - Install the Vercel CLI (requires Node.js/npm):
```bash
npm i -g vercel
```

 - Login once (interactive):
```bash
vercel login
```

 - From this project directory, run a production deploy:
```bash
vercel --prod
```

If you already linked the project, `vercel --prod` will publish. The CLI can also be provided a token (see `vercel login --token <TOKEN>`) for CI.

2) Deploy via Git (recommended for CI/CD)

 - Initialize Git, commit the files, push to GitHub/GitLab/Bitbucket.
 - In the Vercel dashboard, choose "Import Project" and import the repository. Vercel will detect this is a static site and use the included `vercel.json`.

3) Files added in this repo to help deploy

- `vercel.json` — Vercel configuration to serve `9yc.html` at `/`.
- `package.json` — contains a convenience `deploy` script (runs `vercel --prod`).
- `.vercelignore` — prevents common files from being uploaded.

Notes
- If you prefer a different entry filename or a more complex build pipeline, update `vercel.json` accordingly.
- If you want me to run the `vercel --prod` command from here I can, but I'll need you to either (a) confirm and have you perform the interactive login steps locally, or (b) provide a deploy token (not recommended to share publicly). Ask which you prefer.

Enjoy — tell me which deploy method you want and I will proceed.

Using the attached logo image
----------------------------

You uploaded an image you'd like used as the site logo. To use it in the deployed site:

1. Save the attached image into this project at `assets/logo.png` (create the `assets/` directory if it doesn't exist).
2. The HTML already references `assets/logo.png` and includes styles for the image. After you add the image, redeploy (or the site will automatically pick it up on the next push/deploy).

If you'd like, I can add the image to the repo for you — upload the image file here and I'll place it at `assets/logo.png` and re-deploy.
# alhidayamanagement
