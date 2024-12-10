import logo from '../../assets/iStar 3.png';
import './Navbar.css';
import { DROP_MENU } from '../../data';

export default function Navbar() {
    return (
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div id='nav' class="container-fluid">
                <a class="navbar-brand" href="#">
                    <img src={logo} alt="Bootstrap" width="40" height="40"></img>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Trang chủ</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Hoạt động</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Chức Vụ
                            </a>
                            <ul class="dropdown-menu">
                                {DROP_MENU.map((dropMenuItem) => (
                                    <li><a class="dropdown-item" href="#">{dropMenuItem}</a></li>
                                ))}
                            </ul>
                        </li>
                    </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"></input>
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
                </div>
            </div>
        </nav>
    );
}

